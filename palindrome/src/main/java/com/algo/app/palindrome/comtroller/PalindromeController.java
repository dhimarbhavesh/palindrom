package com.algo.app.palindrome.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.algo.app.palindrome.dao.Palindrom;
import com.algo.app.palindrome.repository.PalindromeRepository;

@RestController
public class PalindromeController {

	private final PalindromeRepository repository;

	public PalindromeController(PalindromeRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/palindrom/{input}")
	public Palindrom responce(@PathVariable String input) {

		String ans = longestPalindrome(input);

		Palindrom pl = new Palindrom();
		pl.setLongestPalindrom(ans);
		repository.save(pl);

		return pl;
	}

	private String longestPalindrome(String s) {

		if (s == null || s.length() < 1)
			return "";

		int start = 0, end = 0;

		for (int i = 0; i < s.length(); i++) {

			int len1 = checkFromCenter(s, i, i);
			int len2 = checkFromCenter(s, i, i + 1);
			int len = Math.max(len1, len2);

			if (len > end - start) {

				start = i - ((len - 1) / 2);
				end = i + (len / 2);
			}

		}

		return s.substring(start, end + 1);

	}

	private int checkFromCenter(String s, int left, int right) {

		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}

		return right - left - 1;

	}

}

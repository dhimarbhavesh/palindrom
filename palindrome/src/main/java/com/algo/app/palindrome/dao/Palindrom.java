package com.algo.app.palindrome.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Palindrom {
	
	@Id
	private String longestPalindrom;

	public String getLongestPalindrom() {
		return longestPalindrom;
	}

	public void setLongestPalindrom(String longestPalindrom) {
		this.longestPalindrom = longestPalindrom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((longestPalindrom == null) ? 0 : longestPalindrom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palindrom other = (Palindrom) obj;
		if (longestPalindrom == null) {
			if (other.longestPalindrom != null)
				return false;
		} else if (!longestPalindrom.equals(other.longestPalindrom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Palindrom [longestPalindrom=" + longestPalindrom + "]";
	}

	
}	
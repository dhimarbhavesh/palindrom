
public class BinaryReversal {

	public static void main(String[] args) {

		System.out.println(binaryReversal("47"));

	}

	private static String binaryReversal(String input) {

		int num = Integer.parseInt(input);
		int binary[] = new int[40];
		int index = 0;
		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}

		int n = ((index / 8) + 1) * 8;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(binary[i]);
		}

		int binaryNum = Integer.parseInt(sb.toString());
		int ans = binaryToDecimal(binaryNum);

		return String.valueOf(ans);

	}

	private static int binaryToDecimal(int binaryNumber) {
		int decimal = 0;
		int p = 0;
		while (true) {
			if (binaryNumber == 0) {
				break;
			} else {
				int temp = binaryNumber % 10;
				decimal += temp * Math.pow(2, p);
				binaryNumber = binaryNumber / 10;
				p++;
			}
		}
		return decimal;
	}
}

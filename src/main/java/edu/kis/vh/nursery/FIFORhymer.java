package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	/**
	 * Contain  DefaultCountingOutRhymer
	 */
	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();


	/**
	 * extended method from DefaultCountingOutRhymer
	 */
	@Override
	public int countOut() {
		while (!callCheck())

			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())

			countIn(temp.countOut());

		return ret;
	}
}

package chapter6.introduceExplainingVariable.before;

/**
 * 직관적 임시변수 사용
 */
public class basic {
	private void isFilter() {
		final String platform = "mac";
		final String browser = "ie";
		final int resize = 0;

		if ((platform.toUpperCase().indexOf("MAC") > -1) &&
				(browser.toUpperCase().indexOf("IE") > -1) &&
				wasInitialized() && resize > 0) {
			// 기능 코드
		}

	}

	private boolean wasInitialized() {
		return true;
	}
}

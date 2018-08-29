package chapter6.introduceExplainingVariable.after;

/**
 * 직관적 임시변수 사용
 * (개인적인 생각은 수식이 많은 것 자체가 코드를 너무 복잡하게 만든다. 가급적 수식의 양을 줄이는게 좋을것 같다.)
 */
public class basic {
	private void isFilter() {
		final String platform = "mac";
		final String browser = "ie";
		final int resize = 1;

		final boolean isMacOS = platform.toUpperCase().indexOf("MAC") > -1;
		final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
		final boolean wasResized = resize > 0;

		if (isMacOS && isIEBrowser && wasInitialized() && wasResized) {
			// 기능 코드
		}

	}

	private boolean wasInitialized() {
		return true;
	}
}

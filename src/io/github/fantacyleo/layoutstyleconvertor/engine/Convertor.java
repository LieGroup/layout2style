package io.github.fantacyleo.layoutstyleconvertor.engine;


public class Convertor {

	/**
	 * 例：将android:background="@drawable/composer_button" 转化为 <item name="android:windowNoTitle">true</item>
	 * @param layoutStr
	 * @return
	 */
	public static String Layout2Style(String layoutStr) {
		String[] keyValuePair = layoutStr.trim().split("=");
		StringBuilder sb = new StringBuilder();
		sb.append("<item name=\"");
		sb.append(keyValuePair[0]);
		sb.append("\">");
		// 取出引号之间的部分
		sb.append(keyValuePair[1].substring(1, keyValuePair[1].length() - 1));
		sb.append("</item>");
		return sb.toString();
	}
}

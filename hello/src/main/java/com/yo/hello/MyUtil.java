package com.yo.hello;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MyUtil {

	public static boolean isNullOrEmpty(Object target) {
		return (Objects.isNull(target));
	}

	public static boolean isNullOrEmpty(Object[] target) {
		return (Objects.isNull(target) || target.length == 0);
	}

	public static boolean isNullOrEmpty(String target) {
		return (Objects.isNull(target) || target.isEmpty());
	}

	public static boolean isNullOrEmpty(Collection<?> target) {
		return (Objects.isNull(target) || target.isEmpty());
	}

	public static boolean isNullOrEmpty(Map<?, ?> target) {
		return (Objects.isNull(target) || target.isEmpty());
	}

	public static int getIndexInList(List<?> existList, List<?> inList) {
		if (isNullOrEmpty(existList) || isNullOrEmpty(inList)) {
			return -1;
		}

		int existSize = existList.size();
		int inSize = inList.size();

		if (existSize < inSize) {
			return -1;
		}

		int index = -1;
		int inIndex = 0;
		for (int i = 0; i < existSize; i++) {
			Object existObj = existList.get(i);
			Object inObj = inList.get(inIndex);
			if (existObj.equals(inObj)) {
				inIndex++;
				if (inIndex == inSize) {
					break;
				}
			} else {
				inIndex = 0;
				index = i + 1;
				if (existSize - i < inSize) {
					index = -1;
					break;
				}
			}
		}

		return index;
	}
}

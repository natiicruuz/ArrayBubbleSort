package ejercicio2;

import org.junit.Test;
import org.junit.Assert;

public class BubbleSortTest {

	@Test
	public void testOrdenada() {
		int[] data = { 5, 1, 8, 7, 6, 2 };
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(data);
		
		int[] expectedArr = {1, 2, 5, 6, 7, 8};
		
		Assert.assertArrayEquals(expectedArr, data);
	}
}	
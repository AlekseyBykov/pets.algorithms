package alekseybykov.portfolio.algorithms.linkedlist;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Aleksey Bykov
 * @since 20.04.2020
 */
public class SinglyLinkedListTest {

	@Test
	public void testGetNumberOfNodes() {
		int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList(data);
		assertThat(singlyLinkedList.getNumberOfNodes(), is(10));
	}
}

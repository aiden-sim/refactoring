package chapter4;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import java.io.*;

/**
 * Created by simjunbo on 2018-08-28.
 */
public class FileReaderTester extends TestCase {
	private FileReader _input;

	protected void setUp() {
		try {
			File path = new File("");
			_input = new FileReader(path.getAbsolutePath() + "\\data.txt");
		} catch (FileNotFoundException e) {
			throw new RuntimeException("테스트 파일을 열 수 없음");
		}
	}

	protected void tearDown() {
		try {
			_input.close();
		} catch (IOException e) {
			throw new RuntimeException("테스트 파일을 다는 중 에러 발생");
		}
	}

	@Test
	public void testRead() throws Exception {
		char ch = '&';
		for (int i = 0; i < 4; i++) {
			ch = (char) _input.read();
		}
		assertEquals('d', ch);
	}

	@Test
	public void testReadAtEnd() throws IOException {
		int ch = -1234;
		for (int i = 0; i < 147; i++) {
			ch = _input.read();
		}

		assertEquals("read at end", -1, _input.read());
	}

	@Test
	public void testReadBoundaries() throws IOException {
		assertEquals("read first char", 'B', _input.read());

		int ch;
		for (int i = 1; i < 146; i++) {
			ch = _input.read();
		}

		assertEquals("read last char", '6', _input.read());
		assertEquals("read at end", -1, _input.read());
	}

	@Test
	public void testEmptyRead() throws Exception {
		File empty = new File("empty.txt");
		FileOutputStream out = new FileOutputStream(empty);
		out.close();
		FileReader in = new FileReader(empty);
		assertEquals(-1, in.read());
	}

	@Test
	public void testReadAfterClose() throws Exception {
		_input.close();
		try {
			_input.read();
			fail("read past end에 열외가 발생하지 않음");
		} catch (IOException io) {

		}
	}
}

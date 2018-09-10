package chapter8.duplicateObservedData.before;

import java.awt.*;
import java.awt.event.FocusEvent;

public class IntervalWindow extends Frame {

	TextField _startField = new TextField();
	TextField _endField = new TextField();
	TextField _lengthField = new TextField();

	public static void main(String[] args) {
		IntervalWindow intervalWindow = new IntervalWindow();
		intervalWindow.initial();
	}

	void initial() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(800, 600);
		Label startLabel = new Label("start");
		add(startLabel);

		Label endLabel = new Label("end");
		add(endLabel);

		Label lengthLabel = new Label("length");
		add(lengthLabel);

		_startField.setSize(100, 20);
		add(_startField);
		_endField.setSize(100, 20);
		add(_endField);
		_lengthField.setSize(100, 20);
		add(_lengthField);
		setVisible(true);

		_startField.addFocusListener(new SymFocus());
		_endField.addFocusListener(new SymFocus());
		_lengthField.addFocusListener(new SymFocus());

		_startField.setText("0");
		_endField.setText("0");
		_lengthField.setText("0");
	}

	class SymFocus extends java.awt.event.FocusAdapter {
		public void focusLost(FocusEvent e) {
			Object object = e.getSource();

			/**
			 * Start 필드가 포커스를 잃으면 startField_FocusLost 메서드를 호출,
			 * 다른 필드가 포커스를 잃으면 EndField_FocusLost, LengthField_FocusLost 메서드를 호출
			 */
			if (object == _startField) {
				StartField_FocusLost(e);
			} else if (object == _endField) {
				EndField_FocusLost(e);
			} else if (object == _lengthField) {
				LengthField_FocusLost(e);
			}
		}

		void StartField_FocusLost(java.awt.event.FocusEvent event) {
			if (isNotInteger(_startField.getText())) {
				_startField.setText("0");
			}
			calculateLength();
		}

		void EndField_FocusLost(java.awt.event.FocusEvent event) {
			if (isNotInteger(_endField.getText())) {
				_endField.setText("0");
			}
			calculateLength();
		}

		void LengthField_FocusLost(java.awt.event.FocusEvent event) {
			if (isNotInteger(_lengthField.getText())) {
				_lengthField.setText("0");
			}
			calculateEnd();
		}

		boolean isNotInteger(String str) {
			return true;
		}

		void calculateLength() {
			try {
				int start = Integer.parseInt(_startField.getText());
				int end = Integer.parseInt(_endField.getText());
				int length = end - start;
				_lengthField.setText(String.valueOf(length));
			} catch (NumberFormatException e) {
				throw new RuntimeException("잘못된 숫자 형식 에러");
			}
		}

		void calculateEnd() {
			try {
				int start = Integer.parseInt(_startField.getText());
				int length = Integer.parseInt(_lengthField.getText());
				int end = start + length;
				_endField.setText(String.valueOf(end));
			} catch (NumberFormatException e) {
				throw new RuntimeException("잘못된 숫자 형식 에러");
			}
		}
	}
}

package chapter8.duplicateObservedData.after;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

public class IntervalWindow extends Frame implements Observer {
	private Interval _subject;

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

		_subject = new Interval();
		_subject.addObserver(this);
		update(_subject, null);
	}

	public void update(Observable o, Object arg) {
		_startField.setText(_subject.getStart());
		_endField.setText(_subject.getEnd());
		_lengthField.setText(_subject.getLength());
	}

	class SymFocus extends java.awt.event.FocusAdapter {
		public void focusLost(FocusEvent e) {
			Object object = e.getSource();
			if (object == _startField) {
				StartField_FocusLost(e);
			} else if (object == _endField) {
				EndField_FocusLost(e);
			} else if (object == _lengthField) {
				LengthField_FocusLost(e);
			}
		}

		void StartField_FocusLost(java.awt.event.FocusEvent event) {
			setStart(_startField.getText());
			if (isNotInteger(_startField.getText())) {
				System.out.println("startField");
				_subject.calculateLength();
			}
		}

		void EndField_FocusLost(java.awt.event.FocusEvent event) {
			setEnd(_endField.getText());
			if (isNotInteger(getEnd())) {
				System.out.println("endField");
				_subject.calculateLength();
			}
		}

		void LengthField_FocusLost(java.awt.event.FocusEvent event) {
			setLength(_lengthField.getText());
			if (isNotInteger(_lengthField.getText())) {
				System.out.println("lengthField");
				_subject.calculateEnd();
			}
		}

		public String getEnd() {
			return _subject.getEnd();
		}

		public void setEnd(String end) {
			_subject.setEnd(end);
		}

		public String getStart() {
			return _subject.getStart();
		}

		public void setStart(String start) {
			_subject.setStart(start);
		}

		public String getLength() {
			return _subject.getLength();
		}

		public void setLength(String length) {
			_subject.setLength(length);
		}

		boolean isNotInteger(String str) {
			return true;
		}

	}
}

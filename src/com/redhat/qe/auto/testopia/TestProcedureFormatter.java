package com.redhat.qe.auto.testopia;

import java.util.logging.LogRecord;

import com.redhat.qe.auto.selenium.LogFormatter;

public class TestProcedureFormatter extends LogFormatter {

	@Override
	public String format(LogRecord record) {
		/*if (!record.getLevel().equals(MyLevel.ACTION)) return super.format(record);
		else { */
			String throwable = "";
			if (record.getThrown() != null) throwable = throwableToString(record.getThrown())  + "\n";
			return record.getMessage() + "<br>\n" + throwable;
		//}
	}
	
}

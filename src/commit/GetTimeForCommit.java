package commit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTimeForCommit {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd aaa hh:mm");
		Date time = new Date();
		String now = sdf.format(time);
		System.out.println(now);
	}
}

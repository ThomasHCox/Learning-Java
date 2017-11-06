
public class Alarm {
	private IAlarmEvent mAlarmEvent;
	
	public Alarm(IAlarmEvent alarmEvent){
		mAlarmEvent = alarmEvent;
	}
	
	public void startCountdown(){
		mAlarmEvent.fireAlarm();
	}
	
	public void notNow(){
		mAlarmEvent.snooze();
	}
	
}

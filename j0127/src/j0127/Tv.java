package j0127;

public class Tv {
	boolean power; // 전원 상태
	int channel; // 채널 번호
	
	void power() { power = !power; } // 전원 토글
	void channelUp() { channel++; } // 채널 업
	void channelDown() { channel--; } // 채널 다운

}

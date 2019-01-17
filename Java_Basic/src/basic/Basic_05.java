package basic;

import java.util.Arrays;

/**
 * 성적관리 프로그램
 * 
 *  데이터:
 *    이름 국어 영어 수학 --> 클라스(future)
 *  기능: (CRUD)
 *    점수 리포트: 학생/점수 리스트 + 평균, 최고점, 최저점
 *    추가: 다양한 추가 방법 제공 필요
 *    삭제: 
 *    업데이트: 
 *    검색: 사람이름 --> 성적
 *  
 *  제약사항:
 *      학생 수 최대치: 200 명
 *      과목 수: 3 과목
 ** 
 */

public class Basic_05 {

	final static int maxStudentNum = 200;
	final static int classNum = 3;
	static int numOfStudent = 0;
	static String[] studentNames = new String[maxStudentNum];	
	static int[][] studentScores = new int[maxStudentNum][classNum];
	static String[] classNames = new String[classNum];
	
	public static void main(String[] args) {
		classNames[0] = "국어";
		classNames[1] = "수학";
		classNames[2] = "영어";
		
		// 성적추가
		addScore("홍길동", 80, 50, 100);
		addScore("문재인", 80, 50, 100);
		addScore("이명박", 80, 70, 90);
		addScore("박근혜", 30, 0, 0);
		
		//deleteStudent(5);
		reportScore();
		
		int[] hongScore = findScore("홍길동");
		System.out.println(Arrays.toString(hongScore));
	}
	
	/**
	 * 성적 추가 기능
	 *  입력: 학생이름, 국어, 영어, 수학, 학생이름배열, 학생성적배열
	 *  리턴: int 
	 *  	(0, 양수 --> 성공 (학생아이디))
	 *  	(-1, 추가실패)
	 */
	public static int addScore(String name, int kScore, int eScore, 
			int mScore) {
		// 배열에서 추가할 인덱스 찾아야 함.
		// 배열을 처음부터 검색해서 null로 되어있는 인덱스
		int studentIndex = -1;
		for (int i = 0 ; i < studentNames.length; i++) {
			if (studentNames[i] == null) {
				studentIndex = i;
				break;
			}
		}
		
		if (studentIndex == -1) {	// 빈공간이 없는 경우,
			return -1;
		}
		
		studentNames[studentIndex] = name;
		studentScores[studentIndex][0] = kScore;
		studentScores[studentIndex][1] = eScore;
		studentScores[studentIndex][2] = mScore;
		
		numOfStudent++;
		
		return studentIndex;
	}
	
	/**
	 * 학생 삭제 기능
	 * @param id
	 * @param names
	 * @param scores
	 * @return
	 */
	public static boolean deleteStudent(int id) {
		return false;
	}

	/**
	 * 성적 출력
	 * 
	 * -------------------------
	 * 이름   국어  수학  영어
	 * -------------------------
	 * ㅌㅌㅌ 80    90   50
	 * ...
	 * 
	 * 
	 * -------------------------
	 * 
	 * 전체평균 : 
	 * 
	 * 
	 */
	public static void reportScore() {
		System.out.println("------------------------------");
		System.out.println(" 이름\t" + classNames[0] + "\t" +
					classNames[1] + "\t" + classNames[2]);
		System.out.println("------------------------------");
		
		for (int i = 0; i < maxStudentNum; i++) {
			if (studentNames[i] != null) {
				System.out.print(studentNames[i] + "\t");
				System.out.print(studentScores[i][0] + "\t");
				System.out.print(studentScores[i][1] + "\t");
				System.out.println(studentScores[i][2]);
			}
		}
		
		System.out.println("------------------------------");
	}
	
	/**
	 * 검색 기능
	 * 
	 *  학생이름으로 성적검색
	 */
	public static int[] findScore(String name) {
		return null;
	}
}

















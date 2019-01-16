package basic;

import java.util.Arrays;

public class Basic_05 {

	/**
	 * 성적관리 프로그램
	 * 
	 *  데이터:
	 *    이름 국어 영어 수학 --> 클라스
	 *   
	 *    제약사항:
	 *      최대치: 200 명 
	 * 
	 *  성적 리스트 (CRUD)
	 *  추가:
	 *  삭제:
	 *  업데이트: 
	 *  검색: 사람이름 --> 성적
	 ** 
	 */
	public static void main(String[] args) {
		final int maxStudentNum = 200;
		final int classNum = 3;
		
		String[] studentNames = new String[maxStudentNum];	
		int[][] studentScores = new int[maxStudentNum][classNum];
			
		// 성적추가
		addScore("홍길동", 80, 50, 100, studentNames, studentScores);
		addScore("문재인", 80, 50, 100, studentNames, studentScores);
		addScore("이명박", 80, 70, 90, studentNames, studentScores);
		addScore("박근혜", 30, 0, 0, studentNames, studentScores);
		//deleteStudent(5, studentNames, studentScores);
		reportScore(studentNames, studentScores);
	}
	
	/**
	 * 성적 추가 기능
	 *  입력: 학생이름, 국어, 영어, 수학, 학생이름배열, 학생성적배열
	 *  리턴: int 
	 *  	(0, 양수 --> 성공 (학생아이디))
	 *  	(-1, 추가실패)
	 */
	public static int addScore(String name, int kScore, int eScore, 
			int mScore, String[] names, int[][] scores) {
		// 배열에서 추가할 인덱스 찾아야 함.
		// 배열을 처음부터 검색해서 null로 되어있는 인덱스
		int studentIndex = -1;
		for (int i = 0 ; i < names.length; i++) {
			if (names[i] == null) {
				studentIndex = i;
				break;
			}
		}
		
		if (studentIndex == -1) {	// 빈공간이 없는 경우,
			return -1;
		}
		
		names[studentIndex] = name;
		scores[studentIndex][0] = kScore;
		scores[studentIndex][1] = eScore;
		scores[studentIndex][2] = mScore;
		
		return studentIndex;
	}
	
	/**
	 * 학생 삭제 기능
	 * @param id
	 * @param names
	 * @param scores
	 * @return
	 */
	public static boolean deleteStudent(int id, String[] names, 
			int[][] scores) {
		return false;
	}

	/**
	 * 성적 출력
	 * @param names
	 * @param scores
	 */
	public static void reportScore(String[] names, int[][] scores) {
		System.out.println(Arrays.toString(names));
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i][0] + ", ");
			System.out.print(scores[i][1] + ", ");
			System.out.println(scores[i][2]);
		}
	}
}

















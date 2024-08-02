package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import dto.Todo;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListView {
	private TodoListService service = null;
	private BufferedReader br = null;
	
	public TodoListView() {
		try {
			// 객체 생성 중 발생한 예외를 View에 모아서 처리
			service = new TodoListServiceImpl();
			// 키보드를 입력 받기 위한 객체
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			System.out.println("*** 프로그램 실행 중 오류 발생 ***");
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	// 메인 메뉴
	public void mainMenu() {
		int input = 0;
		do {
			try {
				// 메뉴 출력 후 입력된 번호를 반환 받기
				input = selectMenu();
				
				// 선택된 메뉴 번호에 따라 case 선택
				switch(input) {
				case 1 : fullView(); break;
				case 2 : detailView(); break;
				case 3 : todoAdd(); break;
//				case 4 : updateAmount();break;
//				case 5 : updateMember(); break;
//				case 6 : deleteMember(); break;
				case 0 : System.out.println("*** 프로그램 종료 ***");break;
				default : System.out.println("### 메뉴에 작성된 번호만 입력하세요 ###");
				}
				System.out.println("=====================================================================");
			} catch(NumberFormatException e) {
				System.out.println("\n### 숫자만 입력해 주세요 ###\n");
				input = -1; // 첫 반복에서 종료되지 않게 값 변경
			} catch(IOException e) {
				System.out.println("\n### 입출력 관련 예외 발생 ###\n");
				e.printStackTrace(); // 예외 추적
			} catch(Exception e) { // 나머지 예외 처리
				e.printStackTrace();
			}
		} while(input != 0);
	}
	
	// 메뉴 출력 / 선택하는 메서드
	private int selectMenu() throws NumberFormatException, IOException{
		System.out.println("\n===== Todo List =====\n");
		System.out.println("1. Todo List Full View");
		System.out.println("2. Todo Detail View");
		System.out.println("3. Todo Add");
		System.out.println("4. Todo Complete");
		System.out.println("5. Todo Update");
		System.out.println("6. Todo Delete");
		System.out.println("0. Exit");
		
		System.out.println("select menu number >>> ");
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		return input;
		
	}
	
	// 1. fullview
	private void fullView() {
		System.out.println("===============[1. Todo List Full View]===============");
		
		System.out.println("[완료된 Todo 개수 / 전체 Todo 수 : 2 / 2]");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("인덱스         등록일          완료여부    할 일 제목 ");
		System.out.println("--------------------------------------------------------------------");
		
	}
	// 2. detail view
	private void detailView() throws NumberFormatException, IOException {
		System.out.println("===============[2. Todo Detail View]===============");
		
		System.out.print("인덱스 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
		List<Todo> todoList = service.indexNum(index);
	}
	// 3. todo add
	private void todoAdd() throws IOException {
		System.out.println("===============[3. Todo Add]===============");
		System.out.print("할 일 제목 입력 : ");
		String todo = br.readLine();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

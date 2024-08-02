package dao;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dto.Todo;

public class TodoListDaoImpl implements TodoListDao {
	
	private final String Todo_List = "/io_test/TodoList.dat";
	
	// 할 일을 저장할 List 객체
	private List<Todo> todoList = null;
	
	// 스트림 객체 참조 변수
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	public TodoListDaoImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// todolist.dat 파일이 존재하는지 검사
		File file = new File(Todo_List);
		if(file.exists()) {
			try {
				// 스트림 생성
				ois = new ObjectInputStream(new FileInputStream(Todo_List));
				todoList = (ArrayList<Todo>)ois.readObject();
				
			} finally {
				if(ois != null) ois.close();
			}
		} else {
			todoList = new ArrayList<Todo>();
		}
	}
}



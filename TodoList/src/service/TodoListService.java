package service;

import java.util.List;

import dto.Todo;

public interface TodoListService {

	/**
	 * 
	 * @param index
	 * @return
	 */
	List<Todo> indexNum(int index);

}

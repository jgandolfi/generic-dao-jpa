package br.com.alexandre.genericdaojpa.dao;

public class DAOException extends RuntimeException {

	private static final long serialVersionUID = 8502552068204028464L;

	public DAOException() {
		super();
	}

	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Throwable cause) {
		super(cause);
	}

}

package com.clean_architecture.application.wrapper;

class Result<T> {
	String message = "";
	String status = "200	";
	T data;

	Result( T data,String message,String status){
              this.data=data;
              this.message=message;
              this.status=status ;

      }
}

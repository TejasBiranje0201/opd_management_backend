package com.opd_management.responce;

public class JWtResponse {
	
	 	private String token;
	    private String role;
	    private Object data;
		public String getToken() {
			return token;
		}
		public void setToken(String token) {
			this.token = token;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		@Override
		public String toString() {
			return "JWtResponse [token=" + token + ", role=" + role + ", data=" + data + "]";
		}
		public JWtResponse(String token, String role, Object data) {
			super();
			this.token = token;
			this.role = role;
			this.data = data;
		}
		public JWtResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

	   

}

package tp1.p2.control;

public class ExecutionResult{
	
	private boolean success;
	private boolean draw;
	private String errorMessage = "ERROR";
	/**
	 * Represents the result of a command execution.
	 * 
	 * @param success      stores if the command was executed successfully.
	 * @param draw         stores if the game must be draw.
	 * @param errorMessage Generated error message generated during the command
	 *                     execution
	 */
	public ExecutionResult(boolean success, boolean draw, String errorMessage) {
		super();
		this.success = success;
		this.draw = draw;
		this.errorMessage = errorMessage;
	}
		/**
		 * Generates a {@link CommanExecution result} for a successful command
		 * execution.
		 * 
		 * @param draw stores if the game must be draw.
		 */
		public ExecutionResult(boolean draw) {
			this(true, draw, null);
		}
	
		/**
		 * Generates a {@link CommanExecution result} for an unsuccessful command
		 * execution.
		 * 
		 * @param errorMessage generated error message.
		 */
		public ExecutionResult(String errorMessage) {
			this(false, false, errorMessage);
		}
		
		public boolean isSuccess() {
			return success;
		}
		
		public void setSuccess(boolean success) {
			this.success = success;
		}
		
		public boolean isDraw() {
			return draw;
		}
		
		public void setDraw(boolean draw) {
			this.draw = draw;
		}
		
		public String getErrorMessage() {
			return errorMessage;
		}
		
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
		
		
}
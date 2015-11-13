
public class GradeBook {
	
	//PRIVATE VARIABLES ++++++++++++++++++++++++
			private String _courseName;
			private int[][] _grades;
			
			// CONSTRUCTOR ++++++++++++++++++++++++++++++
			public GradeBook(String courseName, int[][] grades){
				this._courseName = courseName;
				this._grades = grades;
				
			}

			// PROPERTIES +++++++++++++++++++++
			public String getCourseName() {
				return this._courseName;
			}

			public void setCourseName(String courseName) {
				this._courseName = courseName;
			}
			
			
			//PUBLIC METHODS +++++++++++++++++++++++++++++++++++++
				
				public void outputGrades(){
					System.out.println("The Grades are:");
					
					for (int row = 0; row<this._grades.length; row++){
					for (int col = 0; col<this._grades[row].length; col++){
						if (row == 0){
							System.out.printf("%14Test %6d",col);
						}
						if (col == 0){
							System.out.printf("Student %4d",row);
						}
						System.out.printf("%14d", this._grades[row][col]);
					}
					}
				}
				
				

}

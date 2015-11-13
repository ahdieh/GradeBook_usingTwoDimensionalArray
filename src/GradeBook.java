
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
					System.out.printf("%12s"," ");
					
					for (int test = 0; test<this._grades[0].length; test++){
							System.out.printf("%s %d  ","Test",test+1);
						}
							System.out.println("Average");
				
				     for (int row = 0; row<this._grades.length; row++){
				    	 System.out.printf("Student%2d",row+1);
				     
				     for (int grade : this._grades[row]){
				    	  System.out.printf("%8d",grade);
				    	 }
				    	 System.out.println();
				     }
				}
				
				public int getMax(){
					int highest = this._grades[0][0];
					for (int row = 0; row<this._grades.length; row++){
						 for (int grade : this._grades[row]){
							if(grade>highest)
								highest = grade;
						}
					}
					 return highest;

				}
				

}

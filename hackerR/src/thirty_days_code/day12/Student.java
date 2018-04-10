package thirty_days_code.day12;

class Student extends Person {
    
	private int[] testScores;

   /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName,lastName,id);
        this.testScores = testScores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate() {
        int sum = 0;
        int length = testScores.length;
        for(int i=0; i<length; i++) {
            sum += testScores[i];
        }
        double average = sum/length;
        if(average>=90 && average<=100) {
            return 'O';
        } else if(average>=80 && average<90) {
            return 'E';
        } else if(average>=70 && average<80) {
            return 'A';
        } else if(average>=55 && average<70) {
            return 'P';
        } else if(average>=40 && average<55) {
            return 'D';
        } else if(average<40) {
            return 'T';
        }
        return 'O';
    }
}
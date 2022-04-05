public class Sort {
    public static void main(String[] args) {
        char[][] answers = {
                { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
                { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
                { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
                { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

        // Key to the questions
        char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
        int[] scores = new int[8];
        int[] students = { 0, 1, 2, 3, 4, 5, 6, 7 };

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            scores[i] = correctCount;
        }

        bubbleSort(scores, students);

        for (int i = 0; i < scores.length; i++)
            System.out.println("Student " + students[i] + "'s correct count is " + scores[i]);
    }

    public static void bubbleSort(int scores[], int[] students) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (scores[j] < scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;

                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
    }
}

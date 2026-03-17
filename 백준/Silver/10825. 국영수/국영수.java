import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    static class Student {
        String name;
        int kor, eng, math;

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Student> studentInfo = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int[] grades = new int[3];
            for (int index = 0; index < 3; index++) {
                grades[index] = Integer.parseInt(st.nextToken());
            }
            studentInfo.add(new Student(name, grades[0], grades[1], grades[2]));
        }

        studentInfo.sort((a, b) -> {
            if (a.kor != b.kor) return b.kor - a.kor;
            if (a.eng != b.eng) return a.eng - b.eng;
            if (a.math != b.math) return b.math - a.math;
            return a.name.compareTo(b.name);
        });

        for (Student student : studentInfo) {
            bw.write(student.name + "\n");
        }
        
        bw.flush();
    }
}

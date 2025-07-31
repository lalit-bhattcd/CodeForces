import java.util.*;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       @SuppressWarnings("unchecked")
        ArrayList<Integer>[] skills = new ArrayList[4];
        for (int i = 1; i <= 3; i++) {
            skills[i] = new ArrayList<>();
        }

      
        for (int i = 0; i < n; i++) {
            int skill = sc.nextInt();
            skills[skill].add(i + 1); // storing 1-based index
        }


        int totalTeams = Math.min(skills[1].size(),
                          Math.min(skills[2].size(), skills[3].size()));
        System.out.println(totalTeams);

        for (int i = 0; i < totalTeams; i++) {
            int s1 = skills[1].get(i);
            int s2 = skills[2].get(i);
            int s3 = skills[3].get(i);
            System.out.println(s1 + " " + s2 + " " + s3);
        }
    }
}

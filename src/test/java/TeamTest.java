import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamTest {


    @Test
    public void testNewMember() {
        Team team = new Team();

    //    assertEquals("", team.getMembers());
        System.out.println(team.team.entrySet()); // Üres teszt
        String member1 = "John Doe";
        String position1 = "Manual Tester";
        String member2 = "Kate Smith";
        String position2 = "Developer";


       team.newMember(member1, position1);

        System.out.println(team.team.entrySet()); //1 hozzá adás
   //     assertEquals(member1 + " " + position1, team.getMembers());

        team.newMember(member2, position2);
        System.out.println(team.team.entrySet());   // 2. hozzáadás
 //       assertEquals(member1 + " " + position1 + "\r\n" + member2 + " " + position2, team.getMembers());


    }

    @Test
    public void testLeaveTeam() {
        Team team = new Team();
        String member1 = "John Doe";
        String position1 = "Manual Tester";
        String member2 = "Kate Smith";
        String position2 = "Developer";

        team.newMember(member1, position1);

        team.newMember(member2, position2);

        team.leaveTeam(member1);
        System.out.println(team.team.entrySet());
      //  assertEquals(member2 + " " + position2, team.getMembers());
    }

    @Test
    public void testPromote() {
        PositionChanges positionChanges = new PositionChanges();

        String member1 = "John Doe";
        String position1 = "Manual Tester";
        String member2 = "Kate Smith";
        String position2 = "Developer";

        positionChanges.newMember(member1, position1);
        positionChanges.newMember(member2, position2);
        positionChanges.promote(member1, position2);
        positionChanges.promote(member2, position1);

        //assertEquals(member1 + " " + position2 + "\r\n" + member2 + " " + position1, positionChanges.getMembers());
        System.out.println(positionChanges.team.entrySet()); //Itt a vizsgálata a frissitett adatoknak
    }

}
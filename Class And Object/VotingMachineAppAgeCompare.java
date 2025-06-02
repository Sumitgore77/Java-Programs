class Voter {
    int id;
    String name;
    int age;

    public Voter(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class VotingMachine {
    void acceptVote(Voter... voters) {  
        System.out.println("\n=== Eligible Voters ===");
        boolean found = false;

        for (int i = 0; i < voters.length; i++) {
            if (voters[i].age >= 18) {
                found = true;
                System.out.println("Voter ID: " + voters[i].id);
                System.out.println("Name: " + voters[i].name);
                System.out.println("Age: " + voters[i].age);
                System.out.println("----------------------");
            }
        }

        if (!found) {
            System.out.println("No voters are eligible.");
        }
    }
}

public class VotingMachineAppAgeCompare {
    public static void main(String[] args) {

        Voter v1 = new Voter(101, "John", 22);
        Voter v2 = new Voter(102, "Alice", 17);
        Voter v3 = new Voter(103, "Bob", 25);
        Voter v4 = new Voter(104, "Charlie", 16);
        Voter v5 = new Voter(105, "Emma", 30);

        VotingMachine vm = new VotingMachine();
        vm.acceptVote(v1, v2, v3, v4, v5);
    }
}

import java.util.*;

class GroupManager {
    Map<String, List<String>> groups = new HashMap<>();

    boolean addUserToGroup(String user, String group) {
        groups.putIfAbsent(group, new ArrayList<>());
        if (groups.get(group).contains(user)) {
            return false;
        }
        groups.get(group).add(user);
        return true;
    }

    boolean removeUserFromGroup(String user, String group){
        if (!groups.containsKey(group) || !groups.get(group).contains(user)){
            return false;
        }
        groups.get(group).remove(user);
        return true;
    }

    boolean deleteGroup (String group) {
            if (!groups.containsKey(group)){
                return false;
            }
            groups.remove(group);
            return true;
    }

    Set<String> getGroups (){
        return new HashSet<>(groups.keySet());
    }

    Set<String> getUsers (String group){
        if (!groups.containsKey(group)) return new HashSet<>();
        return new HashSet<>(groups.get(group));
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroupManager grupos = new GroupManager();

        while (true) {
            String com = scanner.next();
            String user;
            String group;
            switch (com) {
                case "add":
                    user = scanner.next();
                    group = scanner.nextLine().trim();
                    grupos.addUserToGroup(user, group);
                    break;
                case "remove":
                    user = scanner.next();
                    group = scanner.nextLine().trim();
                    grupos.removeUserFromGroup(user, group);
                    break;
                case "delete":
                    group = scanner.next();
                    grupos.deleteGroup(group);
                    break;
                case "list":
                    group = scanner.nextLine().trim();
                    if (group.isEmpty()) {
                        System.out.println(grupos.getGroups());
                    } else {
                        System.out.println(grupos.getUsers(group));
                    }
                    break;
                case "exit":
                    return;
            }
        }
    }
}
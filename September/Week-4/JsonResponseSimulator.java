// Name: Kunjan

import java.util.ArrayList;
import java.util.List;

class ApiUser
{
    int id;
    String name;
    String email;

    ApiUser(int id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

public class JsonResponseSimulator
{
    public static void main(String[] args)
    {
        List<ApiUser> users = new ArrayList<>();

        users.add(
            new ApiUser(
                1,
                "Kunjan",
                "kunjan@example.com"
            )
        );

        users.add(
            new ApiUser(
                2,
                "Alex",
                "alex@example.com"
            )
        );

        users.add(
            new ApiUser(
                3,
                "Sarah",
                "sarah@example.com"
            )
        );

        System.out.println("==============================");
        System.out.println("       API USER DATA");
        System.out.println("==============================");

        for (ApiUser user : users)
        {
            System.out.println("{");
            System.out.println("  \"id\": " + user.id + ",");
            System.out.println("  \"name\": \"" + user.name + "\",");
            System.out.println("  \"email\": \"" + user.email + "\"");
            System.out.println("}");
            System.out.println();
        }
    }
}
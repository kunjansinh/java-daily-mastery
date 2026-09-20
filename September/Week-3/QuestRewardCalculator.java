// Name: Kunjan

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class QuestRewardCalculator
{
    public static void main(String[] args)
    {
        List<String> quests = new ArrayList<>();

        quests.add("Defeat the Goblin");
        quests.add("Find the Lost Sword");
        quests.add("Rescue the Villager");
        quests.add("Explore the Dark Cave");

        Function<String, Integer> calculateReward =
            quest -> quest.length() * 5;

        System.out.println("==============================");
        System.out.println("       QUEST REWARDS");
        System.out.println("==============================");

        for (String quest : quests)
        {
            int reward = calculateReward.apply(quest);

            System.out.println();
            System.out.println("Quest: " + quest);
            System.out.println("Reward: " + reward + " XP");
        }
    }
}
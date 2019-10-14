import java.util.*;


public class GeorgesAges {


    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Hello Master, i'm your very servile and prominently amnesic Servant, can you remember me your name ?%n");
        //TODO vérifier que tribeName = String
        String tribeName = input.next();
        Tribe player = new Tribe(tribeName);
        System.out.printf("Master %s, the Georges have settled on your World. %n" +
                "As they are a real nuisance (even though they venerate you), you should try to obliterate them as soon as possible ! %n" +
                "Try to lead them to their auto-annihilation by influencing their life.", player.getName());
        System.out.printf("MasterName : %s %n Pop : %d %n Eco : %.3f %n Hate %.3f %n Cult : %.3f %n", player.getName(),
                player.getPopulation(), player.getEconomicWealth(),player.getHateLevel(), player.getCulturalRichness());

        EventAgeOne butterfly = new EventAgeOne("The butterfly has colors",
                "A butterfly fly around a George, should the George kill it (1) or leave it alone (0) ?",
                "hate", true,
                100, "George smashed the butterfly, more than once",
                10, "Maybe, some things will happen", true);
        EventAgeOne war = new EventAgeOne("War",
                "A war is currently occurring around Georges. Should the Georges participate (1) or flee to find a new place (0) ?",
                "hate",false,
                100, "Georges took pleasure in killing, what a strange society...",
                -100, "Georges fled the country, but a lot died in the process, they should have listened to their heart");
        EventAgeOne raid = new EventAgeOne("Not Georges attacked your people",
                "Some Not Georges attacked your Georges, will send them a sign of your power (1) or leave them deal with their enemies (0)",
                "hate", false,
                40, "You struck the raiders with lightning, and Georges worship You, or hate, well, it do not matter.",
                20, "You did nothing, thus, Georges love a little more, well, those a little masochistic");
        EventAgeOne moskitos = new EventAgeOne("Moskitos attack",
                "Some huge Moskitos attacked your Georges, should they stay inside their homes (1) or fight them (0)?",
                "hate", false,
                -40, "Georges are cowards these days. And the moskitos are so big, a house don't do much",
                20, "Georges won against these StoneHenge sized Moskitos. Astounding");
        EventAgeOne fire = new EventAgeOne("Playing with Silex",
                "A George is playing with stones, should he continue ?",
                "eco", false,
                100, "This George discovered fire ! How clever ! (but maybe he wasn't the first, tough...)",
                20, "Percussive music is very trendy these days (but it may bring hate");
        EventAgeOne frogs = new EventAgeOne("It's raining frogs",
                "Some Georges went in a swamp to hunt frogs, will you scare them (1) or or not (0)?",
                "cult", false,
                50, "It's raining frogs !! But the world has not ended (and Georges are still hungry...). Anyway, it was impressive, Your cult is growing.",
                -30, "Who would base an economy on frogs hunt ? The frog Stock Exchange bubble has collapsed");
        EventAgeOne capitalism = new EventAgeOne("Capitalism, already ?",
                "A George has discovered that he could exploit other Georges, will You leave him exploit 99% of the population (1) or not (0)",
                "eco", false,
                2000, "Wow, some Georges are really good at exploiting others, and the economy seems to benefit from it (but it's a simulation, tough...)",
                1000, "Bolchevism is the new George's nature. Will it last long ? (it seems a lot of them hates it...");
        EventAgeOne kitten = new EventAgeOne("Kitten Love",
                "Some Georges started to venerate kitten, leave them burn their income for kitten (1) or not (0)",
                "eco", true,
                -100, "Kitten are so sweet, but the economy risks to collapse if this happens too often",
                500, "Wow, You are cruel, this kittenicide was a bit radical, but they'll come back, as usual (and people hate has grown)");
        EventAgeOne artifact = new EventAgeOne("A strange artifact",
                "A George brought a strange metal box to the village, it's pretty heavy. Should the George keep it (1) or give it to its chief ? (0)",
                "cult", true,
                100, "The George keeps the artifact in his grotto, it buzzes lightly and has a big red button. Maybe something will happen ?!",
                0, "Chief George is very conservative, he hides the artifacts from other Georges");
        EventAgeOne fight = new EventAgeOne("A conflict between Georges",
                "Two Georges are fighting each other on a pasture. Will you force them to stop (1) or leave them alone ? (0)",
                "cult", false,
                20, "You burnt to death one of the George ! Thus the other venerate You (and with no fear...)",
                40, "It kind of remind me of a Southpark episode. Funny ! And their show boosts the local economy !!");
        //TODO modifier output The Idol
        EventAgeOne statue = new EventAgeOne("The Idol",
                "A stone Statue representing you has been found by a George in a grotto. Should the George leave it here (1) or take it with him (0) ?",
                "cult", false,
                10, "Your cult of Hate is still growing among the Georges",
                20, "You may be forgotten now, as an Idol, but some George will find you later (and crippling their economy seems a good revenge, Master");
        EventAgeOne music = new EventAgeOne("Playing with wood sticks",
                "A George is playing with wood sticks, should he continue (1) or stops (0) ? ",
                "cult", false,
                100, "Ah, a George is starting a new band. Again a Gospel to your Glory, Master (sadly)",
                20, "Anyway, he was a pity drummer");

        ArrayList<EventAgeOne> eventList = new ArrayList<>();
        eventList.add(butterfly);
        eventList.add(artifact);
        eventList.add(kitten);
        eventList.add(war);
        eventList.add(raid);
        eventList.add(moskitos);
        eventList.add(fire);
        eventList.add(frogs);
        eventList.add(capitalism);
        eventList.add(fight);
        eventList.add(statue);
        eventList.add(music);

        //Collections.shuffle(eventList);


        evaluateEvent(player, eventList.get(eventRoll(eventList)));
        do {
            waitTime(player, eventList);
            //evaluateEvent(player, eventList.get(eventRoll(eventList)));
        } while (!endOfWorld(player, eventList));



    }

    public static boolean waitTime(Tribe player, ArrayList<EventAgeOne> eventList) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Master %s, how many years should your Georges do stuff without supervision ?", player.getName());
        int years = input.nextInt();
        //TODO vérifier que input = int

        for (int i = 0; i < years; i++) {
            //player.setPopulation(player.getPopulation()+= player.getPopulation() / 6 * player.globalModifier());
            player.setPopulation(player.getPopulation()+ player.getPopulation() / 25);
            //player.setEconomicWealth(player.getEconomicWealth() += player.getPopulation() / 10 * (player.culturalModifier() / 2 ) + player.hateModifier() / 2);
            player.setEconomicWealth(player.getEconomicWealth() + player.getPopulation() / 27);
            //player.setHateLevel(player.getHateLevel() += player.getHateLevel() + 3 * player.hateModifier() - player.culturalModifier() / 2);
            player.setHateLevel(player.getHateLevel() + 1);
            //player.setCulturalRichness(player.getCulturalRichness() += player.getCulturalRichness() + 3 * player.culturalModifier - player.hateModifier() / 8);
            player.setCulturalRichness(player.getCulturalRichness() + 1);
            if (i % 5 == 0) {
                tribeState(player);
            }
            if (i % 13 == 0 || i % 67 == 0) {
                evaluateEvent(player, eventList.get(eventRoll(eventList)));

                if (endOfWorld(player, eventList)) {
                    break;
                    }
                }
            }
        return false;
    }

    public static void tribeState(Tribe player) {
        System.out.printf("Pop : %d %n", player.getPopulation());
        System.out.printf("EcoWealth : %.3f %n", player.getEconomicWealth());
        System.out.printf("HateLevel : %.3f %n", player.getHateLevel());
        System.out.printf("CultRichness : %.3f %n", player.getCulturalRichness());
    }

    public static int eventRoll(ArrayList<EventAgeOne> list) {
        int x = 1;
        Random rand = new Random();
        int diceRoll = rand.nextInt(list.size());
           /*  while (x == 0){
                    if (list.get(diceRoll).isEventStatus() && !list.get(diceRoll).isLocal()) {
                        diceRoll = rand.nextInt(list.size());
                    } else {x = 1;}
            } */
        return diceRoll;
    }

    public static boolean endOfWorld(Tribe player, ArrayList<EventAgeOne> list) {
        //int endWorld = 0;
        //System.out.println("" + endWorld);
        if (!list.get(0).isEventStatus() && list.get(1).isEventStatus() && list.get(2).isEventStatus()) {
            System.out.printf("Master %s, not sure how, but a Butterfly landed on an Artifact's button kept by a George. %n" +
                    " A kitten jumped on the butterfly and, fortunately the button. %n" +
                    "This was the DoomsDay Machine ! %n" +
                    "Wonderful ^_^; !!", player.getName());
        return true;
         }
        if(player.getPopulation() > 1000000000) {
            System.out.printf("Master %s, there is too many Georges on this planet (WHAT A SHAME), %n " +
                    "the procedure of emergency has been launched. %n" +
                    "Destruction in very few seconds !! %n" +
                    "3 %n" +
                    "2 %n" +
                    "1 %n" +
                    "IGNITIOOOOOOON !! %n", player.getName());
            return true;
        }

        /*for (int i = 0; i < list.size(); i++){
            if (list.get(i).getName().equalsIgnoreCase("The butterfly has colors") && list.get(i).isEventStatus() == false) {
                endWorld++;
                System.out.println("" + endWorld);
            }
            if (list.get(i).isLocal() == true && list.get(i).isEventStatus() == false) {
                endWorld++;
                System.out.println("" + endWorld);
            }
            if (endWorld == 3) {
                System.out.printf("Master %s, not sure how, but a Butterfly landed on the Artifact's button. %n" +
                        " A kitten jumped on the butterfly and, the button. %n" +
                        "Apparently, this was the DoomsDay Machine ! %n", player.getName());
                System.out.println(endWorld);
                return true;

            }
            if (endWorld == 3) {
                break;
            }
        }*/
        return false;
    }

    public static void evaluateEvent(Tribe player, EventAgeOne event) {
        Scanner answer = new Scanner(System.in);
        System.out.println(event.isEventStatus());
        System.out.printf("Master %s, the event (%s) may be happening. %n %s %n What do you want to do ?", player.getName(), event.getName(), event.getDescription());

        int eventChoice = answer.nextInt();
        if (eventChoice == 1) {
            event.setEventStatus(true);
            System.out.printf("%s %n %s %n", event.getOutputTrue(), event.isEventStatus());
        } else {
            event.setEventStatus(false);
            System.out.printf("%s %n %S %n", event.getOutputFalse(), event.isEventStatus());
        }
        if (event.getEventType().equals("hate")) {
            if (event.isEventStatus() == true){
                player.setHateLevel(player.getHateLevel() + event.getOutput1());
            } else {
                player.setCulturalRichness(player.getCulturalRichness() + event.getOutput2());
            }
        }
        if (event.getEventType().equals("eco")) {
            if (event.isEventStatus() == true) {
                player.setEconomicWealth((player.getEconomicWealth() + event.getOutput1()));
            } else {
                player.setHateLevel(player.getHateLevel() + event.getOutput2());
            }
        }
        if (event.getEventType().equals("cult")){
            if (event.isEventStatus() == true) {
                player.setCulturalRichness(player.getCulturalRichness() + event.getOutput1());
            } else {
                player.setEconomicWealth(player.getEconomicWealth() + event.getOutput2());
            }
        }
    }

}

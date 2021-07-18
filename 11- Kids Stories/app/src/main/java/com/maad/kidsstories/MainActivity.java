package com.maad.kidsstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] titles = {
            "The bee and the grasshopper", "Chicken Little", "The hungry cat",
            "The ugly duckling"};
    private int[] sounds = {R.raw.bee, R.raw.chicken, R.raw.cat, R.raw.duck};
    private int[] pictures = {R.drawable.bee, R.drawable.chicken, R.drawable.cat, R.drawable.duck};
    private String[] stories =
            {
                    "One day in summer a bee meets a grasshopper. \n" +
                            "- Buzz, buzz, - says the bee. \n" +
                            "- Let's make a little house. I can gather honey and carry it to the house. You gather honey and carry it to the house. When winter comes we shall have it to eat. How happy we shall be. \n" +
                            "- Winter and the cold days are far away, - says the grasshopper. \n" +
                            "- I don't want to gather honey. I want to play, and be happy. Now, good bye, little Bee, good bye! \n" +
                            "All summer the bee is busy gathering honey. \n" +
                            "All summer the grasshopper plays. \n" +
                            "One day in autumn the grasshopper meets the bee. \n" +
                            "- The cold days are here now, little Bee, - he says. - Let us make a home. Let us carry your honey to the house. Then we shall have some honey to eat. How happy we shall be! \n" +
                            "- No, no, - says the little Bee. - It is too late now. Summer is the time to make a house. Summer is the time to gather honey for the winter. I will not live with you. Good bye, grasshopper, good bye! ",

                    "Chicken Little likes to walk in the woods. She likes to look at the trees. She likes to smell the flowers. She likes to listen to the birds singing. \n" +
                            "One day while she is walking an acorn falls from a tree, and hits the top of her little head. \n" +
                            "- My, oh, my, the sky is falling. I must run and tell the lion about it, - says Chicken Little and begins to run. \n" +
                            "She runs and runs. By and by she meets the hen. \n" +
                            "- Where are you going? - asks the hen. \n" +
                            "- Oh, Henny Penny, the sky is falling and I am going to the lion to tell him about it. \n" +
                            "- How do you know it? - asks Henny Penny. \n" +
                            "- It hit me on the head, so I know it must be so, - says Chicken Little. \n" +
                            "- Let me go with you! - says Henny Penny. - Run, run. \n" +
                            "So the two run and run until they meet Ducky Lucky. \n" +
                            "- The sky is falling, - says Henny Penny. - We are going to the lion to tell him about it. \n" +
                            "- How do you know that? - asks Ducky Lucky. \n" +
                            "- It hit Chicken Little on the head, - says Henny Penny. \n" +
                            "- May I come with you? - asks Ducky Lucky. \n" +
                            "- Come, - says Henny Penny. \n" +
                            "So all three of them run on and on until they meet Foxey Loxey. \n" +
                            "- Where are you going? - asks Foxey Loxey. \n" +
                            "- The sky is falling and we are going to the lion to tell him about it, - says Ducky Lucky. \n" +
                            "- Do you know where he lives? - asks the fox. \n" +
                            "- I don't, - says Chicken Little. \n" +
                            "- I don't, - says Henny Penny. \n" +
                            "- I don't, - says Ducky Lucky. \n" +
                            "- I do, - says Foxey Loxey. - Come with me and I can show you the way. \n" +
                            "He walks on and on until he comes to his den. \n" +
                            "- Come right in, - says Foxey Loxey. \n" +
                            "They all go in, but they never, never come out again. ",

                    "A hungry cat is looking for something to eat. She sees a little grey mouse sitting near his house. \n" +
                            "- I want to catch that little mouse, - says the hungry cat. \n" +
                            "She sits down and begins to cry \"mew, mew, mew\". \n" +
                            "The little grey mouse jumps up to run into his house, but the cat sits still and mews again. \n" +
                            "- She is sitting still, - thinks the mouse. \n" +
                            "- She doesn't want to catch me. I shall not run away. \n" +
                            "- Mew, mew, mew, - says the cat again. \n" +
                            "- Why are you crying? - asks the mouse. \n" +
                            "- See, I have a penny in my hand. \n" +
                            "- Good, you are lucky. That's nothing to cry about, - says the mouse. \n" +
                            "The hungry cat comes nearer. \n" +
                            "- Oh, little mouse, I shall get some meat with the penny. I shall cook it and have it for supper. \n" +
                            "- Good, you are lucky. That's nothing to cry about. \n" +
                            "The hungry cat comes nearer and nearer. \n" +
                            "- There lives a hungry dog in this house. He will eat all the meat. \n" +
                            "- Poor Pussy, - says the mouse. - What will you eat then? \n" +
                            "- You, - cries the cat and jumps at the little grey mouse. \n" +
                            "But the mouse is too quick. He jumps into his little house before the cat can say another \"mew\". \n" +
                            "- No, no, sly Pussy, - says the mouse. - You will not eat me. You must first catch me. ",

                    "It is a beautiful summer day. The sun shines warmly on an old house near a river. Behind the house a mother duck is sitting on ten eggs. \"Tchick.\" One by one all the eggs break open. \n" +
                            "All except one. This one is the biggest egg of all. \n" +
                            "Mother duck sits and sits on the big egg. At last it breaks open, \"Tchick, tchick!\" \n" +
                            "Out jumps the last baby duck. It looks big and strong. It is grey and ugly. \n" +
                            "The next day mother duck takes all her little ducks to the river. She jumps into it. All her baby ducks jump in. The big ugly duckling jumps in too. \n" +
                            "They all swim and play together. The ugly duckling swims better than all the other ducklings. \n" +
                            "- Quack, quack! Come with me to the farm yard! - says mother duck to her baby ducks and they all follow her there. The farm yard is very noisy. The poor duckling is so unhappy there. The hens peck him, the rooster flies at him, the ducks bite him, the farmer kicks him. \n" +
                            "At last one day he runs away. He comes to a river. He sees many beautiful big birds swimming there. Their feathers are so white, their necks so long, their wings so pretty. The little duckling looks and looks at them. He wants to be with them. He wants to stay and watch them. He knows they are swans. Oh, how he wants to be beautiful like them. \n" +
                            "Now it is winter. Everything is white with snow. The river is covered with ice. The ugly duckling is very cold and unhappy. \n" +
                            "Spring comes once again. The sun shines warmly. Everything is fresh and green. \n" +
                            "One morning the ugly duckling sees the beautiful swans again. He knows them. He wants so much to swim with them in the river. But he is afraid of them. He wants to die. So he runs into the river. He looks into the water. There in the water he sees a beautiful swan. It is he! He is no more an ugly duckling. He is a beautiful white swan. ",

                    "A villager had an old horse. The horse served too long time to its owner, but he was exhausted by the work and he couldn't work anymore. His crest was tangled up, his hoofs were worn out, and he barely walked. \n" +
                            "The owner pitied his loyal horse, he combed the horse's crest out, he brushed his tail, and he put him iron horseshoes and let him feed on the meadow. \n" +
                            "The horse fed for one-two weeks, he recovered and even started jumping. \n" +
                            "A lion came on the meadow. He saw the horse and started wondering what kind of beast is he? \n" +
                            "- Who are you? - The lion asked - Because I am a lion. The king of all beasts. I will eat you! \n" +
                            "- In order to eat me you need strength - the horse said. \n" +
                            "The lion clapped with his tail and roared: \n" +
                            "- I am the most powerful beast! \n" +
                            "- Oh-ho-ho! The horse neighed - we will see. Let's compete to see who is stronger! \n" +
                            "- And how are we going to compete? - The lion asked. \n" +
                            "- Do you see that big rock over there? \n" +
                            "- Yes, I do - the lion said. \n" +
                            "- The one who hit the rock in a way that sparks come out of it, he will be the stronger one. \n" +
                            "- Okay! – The lion agreed. \n" +
                            "The lion came closer to the rock and started hitting it with his paw. He hit and hit and hurt his legs but not a spark came out. \n" +
                            "- Ha-ha-ha! - The horse laughed. - You are weak, brother, you are very weak. And you consider yourself a king. Look at me how I will hit the rock now. \n" +
                            "The horse turned backwards to the rock, lifted his leg and hit the rock with his horseshoe. Millions of sparks came out. \n" +
                            "\"Oh! What now? – The lion was frightened. \n" +
                            "- You shouldn't joke with such a beast!\" He said nothing, ran away and hid in the forest. \n" +
                            "In the forest he met two wolves. \n" +
                            "- Good afternoon, dear king! – The wolves bowed down. Where have you been? What has happened? \n" +
                            "- I was on the green meadow – the lion said – I saw there the most powerful beast. \n" +
                            "- And who is he? – The wolves gasped. \n" +
                            "- The horse! Have you ever seen a horse? \n" +
                            "- Ha! Ha-ha! – The one wolf laughed. Not only have I seen horses, but I also have eaten a lot of them. \n" +
                            "- What are you saying? – The lion was shocked. - It's impossible! \n" +
                            "- Let's go there, dear king, and you will see how I am going to deal with him. \n" +
                            "And the lion and the wolf went there. \n" +
                            "- Let's see this horse! – The wolf stiffened. \n" +
                            "- It's over there, behind the bushes. \n" +
                            "- I cannot see! – The wolf said. \n" +
                            "The lion grabbed the wolf with his front paws and lifted him up in order to see. \n" +
                            "- Do you see now? \n" +
                            "The wolf didn't answer. He was silent, as if he has lost his tongue. \n" +
                            "The lion dropped the wolf and he was pop-eyed – the king of all animals had strangled him with his paws. \n" +
                            "- Oh, dear wolf! You just looked from afar and passed out. But you were so confident. What would have happened if we had gone closer to the beast? He would have eaten and me, and you. \n" +
                            "And the lion was so afraid of the horse, so he ran away forever somewhere far away. And since then he doesn't live here. "
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, titles);

        ListView list = findViewById(R.id.lv);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this, StoryActivity.class);
                i.putExtra("title", titles[position]);
                i.putExtra("picture", pictures[position]);
                i.putExtra("story", stories[position]);
                i.putExtra("sound", sounds[position]);
                startActivity(i);

            }
        });

    }

    public void openSettings(View view) {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }

}
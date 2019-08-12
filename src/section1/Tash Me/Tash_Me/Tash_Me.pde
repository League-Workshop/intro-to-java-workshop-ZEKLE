PImage mustache;
PImage friend;
void setup() {
friend = loadImage("friend.png");
size (220, 220);
friend.resize(width, height);
mustache = loadImage("mustache.png");
mustache.resize(100, 50);


}

void draw() {
background(friend);
image(mustache, 50, 50);
}

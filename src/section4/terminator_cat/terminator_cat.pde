
int x =324;
int y =128;
int x2 = 279;
int y2 = 94;
int acceleration=5;
PImage catPic;
void setup () {
  size (500, 400);
  catPic = loadImage("cat.jpg");
  catPic.resize(width, height);
  background(catPic);
}
void draw () {
  if (mousePressed) {

    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
    fill (229, 12, 66);
    noStroke ();
    ellipse(x, y, 30, 20);
ellipse(x2,y2,50,35);
}
void keyPressed() {
  x-=1*acceleration;
  y+=1*acceleration;
  x2-=1*acceleration;
  y2+=1*acceleration;
}
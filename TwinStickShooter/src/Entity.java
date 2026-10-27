public class Entity {
    int position;
    int health;

    public int Move(int dir) {
        position += dir;
        return position;
    }
    public int Move(int xMove, int yMove, int gridWidth) {
        position += xMove;
        position += (yMove * gridWidth);
        return position;
    }

    public Entity(int pos) {
        position = pos;
        health = 100;
    }
}

package net.mindview.chapter11;

import java.util.Queue;

public class CommandStart {
    public static void main(String[] args) {
        CommandTwo fill = new CommandTwo();
        Command[] commands = {new Command("A"), new Command("B"), new Command("C")};
        Queue<Command> queue = fill.fillCommand(commands);

        CommandThree en = new CommandThree();
        en.enumeration(queue);
    }
}

package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(new String[]{"0","Item name","1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreatAction(),new Exit()};
        new StartUI().init(in,tracker,actions);
        AssertThat(Tracker.findAll()[0].getName()).isEqualTo("Item name");
    }

    @Test
    public void main() {
    }

    @org.junit.jupiter.api.Test
    void init() {
    }

    @org.junit.jupiter.api.Test
    void testMain() {
    }
}
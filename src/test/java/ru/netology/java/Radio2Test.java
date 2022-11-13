// package ru.netology.java;
//
// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.Test;
//
// public class Radio2Test {
//
// //    @Test
//     public void setStation() {
// //        Radio2 radio2 = new Radio2();
//
// //        radio2.setCurrentStation(1);
//
// //        int expected = 1;
// //     int actual = radio2.getCurrentStation();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void setNeverMinStation() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentStation(-1);
//
//         int expected = 0;
//         int actual = radio2.getCurrentStation();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void setMinStation() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentStation(0);
//
//         int expected = 0;
//         int actual = radio2.getCurrentStation();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void setMaxStation() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentStation(9);
//
//         int expected = 9;
//         int actual = radio2.getCurrentStation();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void setNeverMaxStation() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentStation(10);
//
//         int expected = 0;
//         int actual = radio2.getCurrentStation();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void increaseStation() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentStation(8);
//         radio2.increaseStation();
//
//         int expected = 9;
//         int actual = radio2.getCurrentStation();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void increaseMaxStation() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentStation(9);
//         radio2.increaseStation();
//
//         int expected = 0;
//         int actual = radio2.getCurrentStation();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void decreaseStation() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentStation(8);
//         radio2.decreaseStation();
//
//         int expected = 7;
//         int actual = radio2.getCurrentStation();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void decreaseMinStation() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentStation(0);
//         radio2.decreaseStation();
//
//         int expected = 9;
//         int actual = radio2.getCurrentStation();
//
//         Assertions.assertEquals(expected, actual);
//     }
//     @Test
//     public void decreaseOneStepStation() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentStation(-2);
//         radio2.decreaseStation();
//
//         int expected = 9;
//         int actual = radio2.getCurrentStation();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void setVolume() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentVolume(1);
//
//         int expected = 1;
//         int actual = radio2.getCurrentVolume();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void setMinVolume() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentVolume(0);
//
//         int expected = 0;
//         int actual = radio2.getCurrentVolume();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void setNeverMinVolume() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentVolume(-1);
//
//         int expected = 0;
//         int actual = radio2.getCurrentVolume();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void setMaxVolume() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentVolume(10);
//
//         int expected = 10;
//         int actual = radio2.getCurrentVolume();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void setNeverMaxVolume() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentVolume(11);
//
//         int expected = 0;
//         int actual = radio2.getCurrentVolume();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void increaseVolume() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentVolume(8);
//         radio2.increaseVolume();
//         int expected = 9;
//         int actual = radio2.getCurrentVolume();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void decreaseVolume() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentVolume(8);
//         radio2.decreaseVolume();
//         int expected = 7;
//         int actual = radio2.getCurrentVolume();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void decreaseMinVolume() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentVolume(0);
//         radio2.decreaseVolume();
//         int expected = 0;
//         int actual = radio2.getCurrentVolume();
//
//         Assertions.assertEquals(expected, actual);
//     }
//
//     @Test
//     public void increaseMaxVolume() {
//         Radio2 radio2 = new Radio2();
//
//         radio2.setCurrentVolume(10);
//         radio2.increaseVolume();
//         int expected = 10;
//         int actual = radio2.getCurrentVolume();
//
//         Assertions.assertEquals(expected, actual);
//     }
// }

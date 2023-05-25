package ua.holovko.jadv.hw12.task4;

import java.util.Optional;

class PhoneBook {

    private static final String[] PHONE_BOOK = new String[10];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[3] = "016/161618";
        PHONE_BOOK[4] = "016/161619";
        PHONE_BOOK[5] = "016/161611";
        PHONE_BOOK[6] = "016/161612";
        PHONE_BOOK[7] = "016/161613";
        PHONE_BOOK[8] = "016/161614";
        PHONE_BOOK[9] = "016/161615";

        Optional<Integer> index = findIndexByPhoneNumber("016/161615");
        if (index.isPresent()) {
            System.out.println("Phone number found at index: " + index.get());
        } else {
            System.out.println("Phone number not found");
        }
    }

    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (PHONE_BOOK[i] != null && PHONE_BOOK[i].equals(phoneNumber)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}

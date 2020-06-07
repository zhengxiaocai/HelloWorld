package oop.com.second65AI;

public class AI {

    private static String[] canStartStr = new String[]{"会", "能", "有", "敢", "在"};

    private static String[] handleAskTailStr = {"吗？", "吗?", "吗"};

    public String answer(String question) {
        String canStartResponse = canStart(question);
        if (canStartResponse != null) {
            return canStartResponse;
        }

        String handleAskTail = handleAskTail(question);
        if (handleAskTail != null) {
            return handleAskTail;
        }

        return handleUnkown(question);
    }

    private String canStart(String question) {
        for (int i = 0; i < canStartStr.length; i++) {
            if (question.startsWith(canStartStr[i])) {
                return canStartStr[i] + "!";
            }
        }
        return null;
    }

    private String handleAskTail(String question) {
        for (int i = 0; i < handleAskTailStr.length; i++) {
            if (question.endsWith(handleAskTailStr[i])) {
                return question.replace(handleAskTailStr[i], "!");
//                return question.substring(0, i) + "!";
            }
        }
        return null;
    }

    private String handleUnkown(String question) {
        return question + "!";
    }
}

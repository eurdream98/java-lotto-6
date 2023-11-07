package lotto;

import lotto.model.Lotto;
import lotto.model.LottoRank;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        OutputView.askAmountForLotto();
        List<Lotto> lottos = OutputView.repeatGenerateRandomLotto();
        OutputView.askWinningNumbers();
        List<Integer> winningNumbers=InputView.getWinningNumbers();
        OutputView.askBonusNumbers();
        int bonusNumber = InputView.getBonusNumber();
        Lotto.countWinningTickets(winningNumbers, lottos,bonusNumber);

    }
}

package com.breadwallet.dagger.component;

import android.app.Application;

import com.breadwallet.dagger.module.AppModule;
import com.breadwallet.presenter.fragments.FragmentSend;
import com.breadwallet.repository.RepoModule;
import com.breadwallet.tools.manager.BRApiManager;
import com.breadwallet.wallet.wallets.bitcoin.BaseBitcoinWalletManager;
import com.breadwallet.wallet.wallets.bitcoin.WalletBchManager;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class, RepoModule.class})
@Singleton
public interface AppComponent {
    void inject(Application application);

    void inject(FragmentSend fragmentSend);

    void inject(BaseBitcoinWalletManager baseBitcoinWalletManager);

    void inject(WalletBchManager walletBchManager);

    void inject(BRApiManager brApiManager);

}

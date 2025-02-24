package com.delphiworlds.kastri;

/*******************************************************
 *                                                     *
 *                     Kastri                          *
 *                                                     *
 *        Delphi Worlds Cross-Platform Library         *
 *                                                     *
 * Copyright 2020-2022 Dave Nottage under MIT license  *
 * which is located in the root folder of this library *
 *                                                     *
 *******************************************************/

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;

public interface DWRewardedInterstitialAdLoadCallbackDelegate {

  void onAdDismissedFullScreenContent();
  void onAdFailedToLoad(LoadAdError adError);
  void onAdFailedToShowFullScreenContent(AdError adError);
  void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd);
  void onAdShowedFullScreenContent();
  
}
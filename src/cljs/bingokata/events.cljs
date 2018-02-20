(ns bingokata.events
  (:require [re-frame.core :as re-frame]
            [bingokata.db :as db]
            [bingokata.game-client :as client]))

(re-frame/reg-event-db
 ::initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/reg-event-db
  :start-game
  (fn  [db _]
       (assoc db :actual-card (client/start-game))))


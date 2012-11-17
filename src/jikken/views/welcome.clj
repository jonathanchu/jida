(ns jikken.views.welcome
  (:require [jikken.views.common :as common]
            [jikken.datomic :as jida]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))


(defpage "/" []
         (common/layout
           [:div.query
            [:h1 "実験 - Explore Clojure Projects"]
            [:textarea#query-text
             {:rows 3
              :placeholder "Your query"}]
            [:input#query-submit.btn.btn-large.btn-primary {:value "run" :type "submit"}]
            [:img#loader {:style "display:none;" :src "https://www.zenboxapp.com/assets/loading.gif"}]
            [:p#results]]))

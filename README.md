# Topic Modeling Template - LDA

This template requires spark >= 1.4.0.

Input data is plain text, in data/data.txt , one line per LDA "document".

create a PIO app:
``` pio app new YOURAPPNAME ```

import the data using:
```
python data/import_eventserver.py --access_key YOURACCESSKEYHERE 
```

Params are in engine.json, the most important to consider is number of topics.

build,train the LDA model:
``` 
pio build 
pio train 
pio deploy
```


prediction query:
``` 
{"text":  "wishing he did not have to go"} 
```

The response contains the top topic for this document, as well as the full set of topics for comparison (with the top 10 terms shown for each topic, for reference). You may wish to alter this to return only top topic.

For the time being, you can only query on documents from the training set.


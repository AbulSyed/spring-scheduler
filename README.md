### spring scheduling

- fixedRate - waits for X millis from the start of previous execution before starting next execution
- fixedDelay - waits for X millis from the end of previous execution before starting next execution
- fixedDelayString

"PT1S", "PT1M", "PT1H", "P1D", "P1W", "P1M"

When specifying durations that include only time components (hours, minutes, seconds), you need to include the "T" separator to indicate that it's a time duration

using cron = ""

https://crontab.guru/


all jobs by defualt run on single thread. this means a 2nd job will not run until the first job is over. to overcome this issue we can increase the pool size using:

```
spring:
  task:
    scheduling:
      pool:
        size: 2
```
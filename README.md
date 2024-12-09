# kafka-rss-feed ![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) 	![Apache Kafka](https://img.shields.io/badge/Apache%20Kafka-000?style=for-the-badge&logo=apachekafka)

> Apache Kafka를 활용하는 RSS Feed 크롤러

## 요구사항
- [x] RSS Feed를 크롤링할 수 있어야 합니다.
- [x] 크롤링한 데이터를 Kafka로 넘길 수 있어야 합니다.
- [x] Kafka에서 데이터를 받아와 액션을 취할 수 있어야 합니다.
- [x] 받아온 데이터를 데이터베이스에 저장해야 합니다.
- [x] 헥사고날 아키텍처를 적용해야 합니다.
- [x] Kotlin MultiModule을 적용하여 Producer와 Consumer를 분리해야 합니다.
- [ ] RSS Feed 외의 웹 사이트 크롤러를 만들어 확장할 수 있어야 합니다.
